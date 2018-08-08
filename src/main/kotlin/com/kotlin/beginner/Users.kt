package com.kotlin.beginner;

import javax.persistence.*;

/*@Entity
class Users(val name:String="",
			val salary:Int=2000,
			@Id
			@GeneratedValue(strategy=GenerationType.AUTO)
			val id:Long=0)
{
	
}*/

@Entity
data class Users(
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	var  id : Long =0,
	var  name : String="",
	var  salary : Long =0
		
)