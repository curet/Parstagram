package com.jose.parstagram.fragments

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.jose.parstagram.Post
import com.jose.parstagram.R

class PostAdapter(val context: Context, val posts: ArrayList<Post>)
    : RecyclerView.Adapter<PostAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostAdapter.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_post, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostAdapter.ViewHolder, position: Int) {
        val post = posts.get(position)
        holder.bind(post)
    }

    override fun getItemCount(): Int {
        return posts.size
    }

    // Clean all elements of the recycler
    fun clear() {
        posts.clear()
        notifyDataSetChanged()
    }


    fun addAll(postList: List<Post>) {
        posts.addAll(postList)
        notifyDataSetChanged()
    }

    fun addNumberOfPost(postList: List<Post>, numberOfPost: Int){
        var endOfIterator = numberOfPost - 1
        if (postList.size < 20){
            endOfIterator = postList.size - 1
        }

        for (i in 0..endOfIterator) {
            posts.add(postList[i])
        }
        notifyDataSetChanged()
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val tvUsername: TextView
        val ivImage: ImageView
        val tvDescription: TextView

        init {
            tvUsername = itemView.findViewById(R.id.tv_username)
            ivImage = itemView.findViewById(R.id.iv_image)
            tvDescription = itemView.findViewById(R.id.tv_description)

        }

        fun bind(post: Post){
            tvDescription.text = post.getDescription()
            tvUsername.text = post.getUser()?.username

            Glide.with(itemView.context).load(post.getImage()?.url).into(ivImage)

        }
    }

}