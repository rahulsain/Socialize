package com.example.socialize.models

import com.example.socialize.models.User

data class Post (
    val text: String = "",
    val createdBy: User = User(),
    val createdAt: Long = 0L,
    val likedBy: ArrayList<String> = ArrayList())