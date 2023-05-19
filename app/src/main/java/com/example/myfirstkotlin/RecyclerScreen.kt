package com.example.myfirstkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView


class NumberItem(val value: Int) {
    companion object {
        val listOfNumbers = listOf(
            NumberItem(1),
            NumberItem(2),
            NumberItem(3),
            NumberItem(4),
            NumberItem(5)
        )
    }
}


class NumberAdapter(private val numbers: List<NumberItem>) : RecyclerView.Adapter<NumberAdapter.NumberViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return NumberViewHolder(view)
    }
    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        val numberItem = numbers[position]
        holder.bind(numberItem)
    }

    override fun getItemCount(): Int {
        return numbers.size
    }

    inner class NumberViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val numberTextView: TextView = itemView.findViewById(R.id.numberTextView)

        fun bind(numberItem: NumberItem) {
            numberTextView.text = numberItem.value.toString()
        }
    }
}

class RecyclerScreen : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var numberAdapter: NumberAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_screen)

        // Initialize the RecyclerView
        recyclerView = findViewById(R.id.recyclerView)

        // Set layout manager for the RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Create the list of numbers
        val numberList = createNumberList()

        // Create the adapter and pass in the number list
        numberAdapter = NumberAdapter(numberList)

        // Set the adapter on the RecyclerView
        recyclerView.adapter = numberAdapter
    }

    private fun createNumberList(): List<NumberItem> {
        // Create a list of number items
        return NumberItem.listOfNumbers
    }
}
