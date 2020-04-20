package com.techwasti.restapi.springbootmongodb.restapi.data

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Hospital(
    @Id
    val id: ObjectId = ObjectId.get(),
    val name: String,
    val adresse: String
    )
