package com.example.geekspro

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.geekspro.databinding.ItemCarBinding

class CarAdapter(
    private val carList: List<Car>
): RecyclerView.Adapter<CarAdapter.CarViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        return CarViewHolder(ItemCarBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return carList.size
    }

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        holder.onBind(carList[position])
    }

    class CarViewHolder(private var binding: ItemCarBinding):
        RecyclerView.ViewHolder(binding.root){
        fun onBind(car: Car) {
            binding.tvName.text = car.name
            binding.tvYear.text = car.Year.toString()
            binding.imgCar.loadImage(car.Img)
        }
    }
}