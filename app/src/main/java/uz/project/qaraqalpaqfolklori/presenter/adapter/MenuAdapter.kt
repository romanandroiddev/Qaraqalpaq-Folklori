package uz.project.qaraqalpaqfolklori.presenter.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uz.project.qaraqalpaqfolklori.R
import uz.project.qaraqalpaqfolklori.local.data.MenuData


class MenuAdapter(private val list: List<MenuData>) : RecyclerView.Adapter<MenuAdapter.VH>() {

    private var listener: ((Int) -> Unit)? = null

    inner class VH(view: View) : RecyclerView.ViewHolder(view) {
        private val title: TextView = itemView.findViewById(R.id.item_title)

        init {
            itemView.setOnClickListener {
                listener?.invoke(absoluteAdapterPosition)
            }
        }

        fun bind() {
            itemView.apply {
                title.text = list[absoluteAdapterPosition].title
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        VH(LayoutInflater.from(parent.context).inflate(R.layout.item_menu_data, parent, false))

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.bind()
    }

    override fun getItemCount(): Int = list.size

    fun setListener(f: (Int) -> Unit) {
        listener = f
    }


}