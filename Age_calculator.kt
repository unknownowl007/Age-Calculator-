import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate
import java.time.temporal.ChronoUnit
@RequiresApi(Build.VERSION_CODES.O)
fun main(){
    print("Please enter your birth day accordingly \n")
    print("Birth Year: ")
    val byear = readLine()!!.toInt()
    print("Birth Month(in numbers): ")
    val bmon = readLine()!!.toInt()
    print("Day of Birth: ")
    val bday = readLine()!!.toInt()

    val birthday = LocalDate.of(byear,bmon,bday)
    val currentdate = LocalDate.now()

    val years = ChronoUnit.YEARS.between(birthday, currentdate)
    val months = ChronoUnit.MONTHS.between(birthday.plusYears(years), currentdate)
    // Adjust for years
    val days = ChronoUnit.DAYS.between(birthday.plusYears(years).plusMonths(months), currentdate)
    // Adjust for years and months
    print("You are $years Years $months months and $days Days old")
}
