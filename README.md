# project-3
DateTimeOne {
This class uses LocalDateTime objects to get the values needed for the various operations. getValueOfSecond()
of course returns the second. DateTimeNow() returns the current system date and time in the given format. 
sleepForFiveSec() causes the system to rest for five seconds if the current returned second value is 55 or higher.
dateTimeOfOtherCity() and dateTimeOfDifferentzone() more or less do the same thing, but in different ways; both print 
out the values of the dates and times in the given zones, however, they are in different formats, and dateTimeDifferentZone()
also puts the values into the already-created HashMap. Finally, timeZoneHashMap() prints out the already-made and filled
HashMap, then goes through and prints it in different orders and formats.

DateTimeTwo {
This class is similar to the last, but does some different things. daysOfCurrentMonth() is simple enough, and uses formatting
and different SimpleDateTime objects to print out the days of the week that make up the given numerical day value 
for a month. daysOfAnyMonth() is similar; although this one prints out the days for any given month, rather than the system month.
compareYear() uses an already-made readIn() method to read the file, and then compares the given years to figure out if they are leap
years and the distance in years, days, and months between now and then. Uses like a billion else if statements to accomplish this.
Probably a more efficient way to do it, but my experimentation with for loops didn't go well, so voila.
dateHashMap() and dateHashMapSorted() both do more or less the same thing, printing out the already-filled HashMaps, however the latter
is, fittingly, sorted, specifically using TreeMaps.

MesoAsciiCal {
This one is pretty simple. firstAvg() takes the ASCII average of the given stID, while secondAvg() takes the ASCII average of the final String
"NRMN". Finally the implementation of the abstract class calAverage() compares the two, getting the ASCII average of both already-figured averages.

MesoEquivalent {
Also pretty simple, though implementing it in actuality was a complete bastard. Uses a readIn() method to read the file, then goes through and compares
a HashMap (filled via array) to find station names that share the ASCII average found by calling on MesoAsciiCal. Then prints them out. Don't know why this 
one gave me so much trouble but it did

MesoLexicographical {
Another really simple one that for some reason zyBooks thinks is wrong in its entirety. All it does is print out a sorted HashMap. Like, that's it. And my
output is correct. zyBooks just doesn't like it

DateSortingUsingAlgorithm {
Didn't finish this one. Sorry
