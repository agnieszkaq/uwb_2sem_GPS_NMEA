# uwb_2sem_GPS_NMEA
Project of second degree mobile classes. Create GPS NMEA Parser. 

# Task command: 

```
Data parser from GPS receiver in NMEA-0183 standard

1. Write a program called GPS and implement NMEAParser in it that it maintains
appropriate data structures storing:
• user's position,
• list of currently visible satellites (along with information about a given satellite),
• list of satellites based on which position was determined,
• updated this data based on the incoming data from the GPS receiver.
2. The module is to parse the input data and update the relevant data based on it
structure (does not support communication with the device).
3. If you encounter data that is not supported - the line should be rejected.
4. Data coming from the GPS transmitter may consist of several lines - the program should
first divide the received data into individual lines and parse each of them
separately.
5. Lines that do not come in full or start with a character other than $ (this is the case
it can happen, e.g. due to reading data from a GPS receiver in an inappropriate one
place), please reject.
6. Test the parser on the following data sequences and write interpreted
data.
7. The result of parsing the following data together with the program code attach to moodle.
```
