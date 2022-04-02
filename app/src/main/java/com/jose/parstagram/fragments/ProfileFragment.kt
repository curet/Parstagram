package com.jose.parstagram.fragments

import android.util.Log
import com.jose.parstagram.Post
import com.parse.FindCallback
import com.parse.ParseException
import com.parse.ParseQuery
import com.parse.ParseUser

class ProfileFragment: FeedFragment() {
    override fun queryPosts(){
        val query: ParseQuery<Post> = ParseQuery.getQuery(Post::class.java)
        query.include(Post.KEY_USER)
        query.whereEqualTo(Post.KEY_USER, ParseUser.getCurrentUser())
        query.addDescendingOrder("createdAt") // return post in descending order: newer posts first
        query.findInBackground(object: FindCallback<Post> {
            // Find all the posts from the server
            override fun done(posts: MutableList<Post>?, e: ParseException?) {
                if (e != null){
                    // Something wrong
                    Log.e(TAG, "Error fetching posts")
                }else{
                    adapter.clear() // cleat out current fetched posts
                    if (posts != null){
                        for (post in posts){
                            Log.i(TAG, "Post: " + post.getDescription() + " , username: "
                                    + post.getUser()?.username)
                        }

                        allPosts.addAll(posts)
                        adapter.notifyDataSetChanged()
                        swipeContainer.setRefreshing(false)  // signal refresh has finished
                    }
                }
            }

        })
    }

}