package com.demo.code.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.demo.code.R
import com.demo.code.databinding.FragmentMovieListBinding
import com.demo.code.model.Movie
import com.demo.code.network.ApiProvider
import com.demo.code.ui.MovieAdapter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MovieListFragment: Fragment() {

  private lateinit var movieAdapter: MovieAdapter

  private var _binding: FragmentMovieListBinding? = null
  private val binding get() = _binding!!

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
    _binding = FragmentMovieListBinding.inflate(inflater, container, false)
    return binding.root
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    movieAdapter = MovieAdapter()
    binding.movieRecyclerview.adapter = movieAdapter

    val movieApi = ApiProvider.getMovieApi(requireContext())
    movieApi.movies().enqueue(object : Callback<List<Movie>> {
      override fun onFailure(call: Call<List<Movie>>, t: Throwable) {
        showErrorState()
      }

      override fun onResponse(call: Call<List<Movie>>,
                              response: Response<List<Movie>>) {
        if (response.isSuccessful && response.body() != null) {
          val movies = response.body()!!
          if (movies.isEmpty()) {
            showEmptyDataState()
          } else {
            showMovieList(movies)
          }
        } else {
          showErrorState()
        }
      }
    })
  }

  private fun showEmptyDataState() {
    binding.movieRecyclerview.visibility = View.GONE
    binding.progressBar.visibility = View.GONE
    binding.textview.visibility = View.VISIBLE
    binding.textview.text = getString(R.string.there_seems_to_be_no_data)
  }

  private fun showMovieList(movies: List<Movie>) {
    binding.movieRecyclerview.visibility = View.VISIBLE
    binding.progressBar.visibility = View.GONE
    binding.textview.visibility = View.GONE
    movieAdapter.setCharacterList(movies)
  }

  private fun showErrorState() {
    binding.movieRecyclerview.visibility = View.GONE
    binding.progressBar.visibility = View.GONE
    binding.textview.visibility = View.VISIBLE
    binding.textview.text = getString(R.string.something_went_wrong)
  }

  override fun onDestroyView() {
    super.onDestroyView()
    _binding = null
  }
}