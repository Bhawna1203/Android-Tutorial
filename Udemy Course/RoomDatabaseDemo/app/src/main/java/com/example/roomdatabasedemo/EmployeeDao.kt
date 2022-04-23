package com.example.roomdatabasedemo

import androidx.room.*
import kotlinx.coroutines.flow.Flow
//Todo  create the dao interface for implementing the Room Storage
@Dao
interface EmployeeDao {

    // Todo: create a suspend insert function for saving an entry
    @Insert
    suspend fun insert(employeeEntity: EmployeeEntity)

    // Todo: create a suspend update function for updating an existing entry
    @Update
    suspend fun update(employeeEntity: EmployeeEntity)

    // Todo: create a suspend delete function for deleting an existing entry
    @Delete
    suspend fun delete(employeeEntity: EmployeeEntity)
    // Todo: create a function to read all employee, this returns a Flow
    @Query("Select * from `employee-table`")
    fun fetchAllEmployee():Flow<List<EmployeeEntity>>

    // Todo 5: create a function to read one employee, this returns a Flow
    @Query("Select * from `employee-table` where id=:id")
    fun fetchEmployeeById(id:Int):Flow<EmployeeEntity>
}

//Flow is one to change the value at run time
//val updates:Flow<List<User>> = emptyFlow  (Syntax for the same)

//For updation there is a function calleed = Collect{}
// updates.collect{userList ->
//       setupUi(userList)
//}

//Other ways to Listen to a flow
/*
1) collectLatest
2) collectINdexed
3) combine
 */