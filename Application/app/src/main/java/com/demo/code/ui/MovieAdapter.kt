package com.demo.code.ui

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.demo.code.databinding.RowMovieViewholderBinding
import com.demo.code.model.Movie

class MovieAdapter() : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

  private val movieList = mutableListOf<Movie>()

  fun setCharacterList(movies: List<Movie>) {
    this.movieList.clear()
    this.movieList.addAll(movies)
    notifyDataSetChanged()
  }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
    val rowMovieViewholderBinding = RowMovieViewholderBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    return MovieViewHolder(rowMovieViewholderBinding)
  }

  override fun getItemCount() = movieList.size

  @SuppressLint("DefaultLocale")
  override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
    val movie = movieList[position]
    with(holder) {
      Glide.with(moviePosterImageView)
          .load(movie.poster)
          .centerCrop()
          .into(moviePosterImageView)

      movieNameTextView.text = movie.id.toString().plus(" ").plus(" Name")
    }
  }

  inner class MovieViewHolder(rowMovieViewholderBinding: RowMovieViewholderBinding) : RecyclerView.ViewHolder(rowMovieViewholderBinding.root) {
    val movieNameTextView = rowMovieViewholderBinding.movieNameTextview
    val moviePosterImageView = rowMovieViewholderBinding.moviePosterImageview
    val rootView = rowMovieViewholderBinding.root
  }
}