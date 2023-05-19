package com.example.myfirstkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView

class MovieAdapter(private val movies: List<String>) : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return MovieViewHolder(view)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = movies[position]
        holder.bind(movie)
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    inner class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val movieTextView: TextView = itemView.findViewById(R.id.numberTextView)

        fun bind(movie: String) {
            movieTextView.text = movie
        }
    }
}

class RecyclerPersonalScreen: AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var movieAdapter: MovieAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_screen)

        // Initialize the RecyclerView
        recyclerView = findViewById(R.id.recyclerView)

        // Set layout manager for the RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Create the list of movies
        val movieList = createMovieList()

        // Create the adapter and pass in the movie list
        movieAdapter = MovieAdapter(movieList)

        // Set the adapter on the RecyclerView
        recyclerView.adapter = movieAdapter
    }

    private fun createMovieList(): List<String> {
        // Create a list of movie titles
        return listOf("Equilibrium", "Matrix", "Howls Moving Castle", "Big Hero 6", "Trigun")
    }
}
