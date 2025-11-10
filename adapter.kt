package com.example.card

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FlightAdapter(private val flights: List<Flight>) :
    RecyclerView.Adapter<FlightAdapter.FlightViewHolder>() {

    class FlightViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        val tvAirline: TextView = itemView.findViewById(R.id.tvAirline)
        val tvDepartureCity: TextView = itemView.findViewById(R.id.tvDepartureCity)
        val tvDepartureTime: TextView = itemView.findViewById(R.id.tvDepartureTime)
        val tvFlightType: TextView = itemView.findViewById(R.id.tvFlightType)
        val tvDuration: TextView = itemView.findViewById(R.id.tvDuration)
        val tvArrivalCity: TextView = itemView.findViewById(R.id.tvArrivalCity)
        val tvArrivalTime: TextView = itemView.findViewById(R.id.tvArrivalTime)
        val tvPrice: TextView = itemView.findViewById(R.id.tvPrice)
        val tvCashback: TextView = itemView.findViewById(R.id.tvCashback)
        val ivPriceIcon: ImageView = itemView.findViewById(R.id.ivPriceIcon)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlightViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.flight_item, parent, false)
        return FlightViewHolder(view)
    }

    override fun onBindViewHolder(holder: FlightViewHolder, position: Int) {
        val flight = flights[position]
//        holder.tvAirline.text = flight.airline
        holder.tvDepartureCity.text = flight.departureCity
        holder.tvDepartureTime.text = flight.departureTime
        holder.tvFlightType.text = flight.flightType
        holder.tvDuration.text = flight.duration
        holder.tvArrivalCity.text = flight.arrivalCity
        holder.tvArrivalTime.text = flight.arrivalTime
        holder.tvPrice.text = flight.price
        holder.tvCashback.text = flight.cashback
    }

    override fun getItemCount() = flights.size
}
