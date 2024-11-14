package com.example.soundnova

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class SongAdapter(private val songs: List<Song>) : RecyclerView.Adapter<SongAdapter.SongViewHolder>() {

    inner class SongViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val songName: TextView = view.findViewById(R.id.textSongName)
        val songArtist: TextView = view.findViewById(R.id.textSongArtist)
        val songImage: ImageView = view.findViewById(R.id.imageSong)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_song, parent, false)
        return SongViewHolder(view)
    }

    override fun onBindViewHolder(holder: SongViewHolder, position: Int) {
        val song = songs[position]
        holder.songName.text = song.name
        holder.songArtist.text = song.artist
        Glide.with(holder.itemView.context).load(song.imageUrl).into(holder.songImage)
    }

    override fun getItemCount(): Int = songs.size
}