# DopamineDrip

Part # 1 
 * Description: In this program we are creating an IV
 * calculation of a neurotransmitter named Dopamine. This will help paramedics
 * treat patients who are in cardiogenic shook. In order to obtain this IV
 * calculation we need the patients weight (kg), the dose(µg), and the
 * time(min). We are given that the range of the dose needs to be between
 * 5-10µg/kg/min. However, each patient has a different weight so, given their
 * weight we need to calculate how many drops of the dose per min. To conduct
 * this we will need the number ml to infused(mg), number of drops(ml)=60
 * drops/min, and concentration(ml) = 0.8(mg/ml). This will require a two step
 * process.
 *
 * instructions: Step #1: We need to first get the number of ml to be infused
 * over the time in Milligrams/min. The Formula is mlInfused = ((weight * dose)
 * / 1000)/ (perMin))
 *
 * Step #2 : To find the drip rate. dripRate= ((mlInfused *
 * dropsMl)/concentration )/ (perMin)).
 *
 * We will be using the Boolean Method and trailer method to write this program.
 * Boolean method is effective when we want a while to return a true or false
 * value. This will be useful to make sure we stay in the dose rage
 * 5-10µg/kg/min. Now we will use the trailer method. This method is effective
 * when we want a while condition expression or to any ture non zero value. So
 * will create another while loop with the condition dose is greater than zero.
 * Then we will signal the data to stop by entering a zero and that is our
 * trailer. This will help us get the mlInfused and dripRate.

 Part # 2 
 * In this program is we are continuing IV
 * calculation from part# 1 but, now we are just entering the patients
 * weight(kg) and calculating the dripRate(perMin) given the dose range
 * 5-10µg/kg/min.
 *
 * We will be writing this with program with the trailer method. We will first
 * create a while loop with the condition that dose is greater than zero. Within
 * the while loop we will create a for loop which will set condition to stay in
 * the dose range 5-10µg/kg/min and add one to the dose and then compute the
 * dripRate(preMin) for each dose until reach 10µg. Then we will signal the data
 * to stop by entering a zero and that is our trailer.
