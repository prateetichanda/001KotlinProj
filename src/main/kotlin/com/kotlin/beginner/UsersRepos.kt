package com.kotlin.beginner

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UsersRepos :CrudRepository<Users,Long>