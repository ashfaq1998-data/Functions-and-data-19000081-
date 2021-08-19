object bank extends App{

  var x = new Account("abc", 4500, 4567.9)
  var y = new Account("def", 5000, 8999.9)
  var z = new Account("ghi", 8777, -8945.9)
  var x1 = new Account("jkl", 8911, -119.9)
  var y1 = new Account("mno", 9999, -999.9)
  var z1 = new Account("pqr", 1111, -299.9)

  var bank:List[Account]=List(x,y,z,x1,y1,z1)


  val overdraft=(b:List[Account])=> b.filter(x => x.balance.<(0))
  var n = overdraft(bank)

  println(n)

  val balance = ( b: List[Account] ) => b.map( x => x.balance ).reduce( (a , c) => ( a + c) )
  val m = balance(bank)

  println("The sum of all account balances " +m)

  val interest=(b:List[Account])=>b.map(x => if(x.balance > 0){x.balance + x.balance * 0.05} else{x.balance + x.balance * 0.1})
  var o = interest(bank)
  println(o)


}


class Account(id:String,n: Int, b: Double) {
    val nic:String=id
    val acnumber: Int = n
    var balance: Double = b
    override def toString = "The person belongs to nic "+nic+ "with account number" +acnumber + " has " + balance + "\n"


}
