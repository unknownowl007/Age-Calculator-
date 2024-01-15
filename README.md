# Age-Calculator-
val age = 2023 - byear 
we could write this to find out the age, but it will be required to upgrade the code
 every year for working properly so we have to change it with device year,
 and for that we have to take java utility input
 also here i used 
  val months = ChronoUnit.MONTHS.between(birthday.plusYears(years), currentdate)
to Adjust for years
and     val days = ChronoUnit.DAYS.between(birthday.plusYears(years).plusMonths(months), currentdate)
to Adjust for years and months
