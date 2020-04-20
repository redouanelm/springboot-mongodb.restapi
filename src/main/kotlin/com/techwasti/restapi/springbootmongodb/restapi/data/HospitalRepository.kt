package com.techwasti.restapi.springbootmongodb.restapi.data

import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface HospitalRepository : MongoRepository<Hospital, String> {
    fun findOneById(id: ObjectId): Hospital
    override fun deleteAll()

}