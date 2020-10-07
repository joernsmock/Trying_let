// #4 from: 10 kotlin tricks by Jake Wharton


/* 'Safe Calls' in the Kotlin book:

Safe calls are useful in chains. For example, if Bob, an Employee,
may be assigned to aDepartment (or not), that in turn may have another
Employee as a department head, then to obtain the name of Bob's department
head (if any), we write the following:

bob?.department?.head?.name

 */

fun main(args: Array<String>)
{
    class User(val name_param: String, val password_param: String) {
        val name = name_param
        val password = password_param
    }

    //var user: User? = null
    var user: User? = User("me", "1234") // this is not null

    user?.let {
        // it == user not null, only read once!
        println(user.name)

        // others like this:
        // user?.apply
        // user?.run
        // user?.also
    }

    // from the book:
    val listWithNulls: List<String?> = listOf("Kotlin", null)
    for (item in listWithNulls) {
        item?.let { println(it) } // prints Kotlin and ignores null
    }

}
