object Account extends App {
  var x = new Accountclass("abc", 4500, 4567.9)
  var y = new Accountclass("pqr", 1111, -299.9)

  var bank:List[Accountclass]=List(x,y)

  val m = x.transfer(y,500.8)
  println("The new balances in the account is" + bank)




}




class Accountclass(id:String,n: Int, b: Double) {
    val nic:String=id
    val acnumber: Int = n
    var balance: Double = b
    override def toString = "The person belongs to nic "+nic+ " with account number " +acnumber + " has " + balance + "\n"

    def withdraw(a:Double) = this.balance=this.balance-a
    def deposit(a:Double) = this.balance=this.balance+a

    def transfer(a:Accountclass,b:Double) = {
       a.balance = a.balance + b
       this.balance = this.balance - b
    }
}
