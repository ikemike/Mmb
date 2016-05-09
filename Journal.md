Feb. 10 - Project outline in progress


Week 3
Project idea in motion. Some issues with getting IntelliJ and Openshift working.

Week 4
I'm trying to re-coup what I've missed by putting off my project work. I spent some time this week
re-reading material from weeks 1-3. Having a lot of environment issues that are really preventing me from
continuing. I spent a good amount of time researching the libraries I'll need to use in order to get the
Mindflex headset communicating. I also bought two mindflex headsets off of a local ebay seller this week.
Unfortuntely I've found that my original plan of using my Raspberry Pi to communicate with the headset
will not work. I'm now trying to find out which arduino board to invest in.

Week 5
Research! I have a little more motivation going this week to catch up since I purchased the arduino Uno I plan
to use with the Mindflex headsets. I took one headset apart, soldered and wired it up, and started searching for
ways to read the data. Need to spend some more time researching available libraries that use the arduino IDE.
Spent some team reading about Processing, an arduino scripting environment.


Week 6
Spent a bit of time playing with the headsets this week. Currently contemplating how I'll display the data
on my website. Had some set backs due to compatibility issues between the Mindflex Brain (open source) libraries and
the arduino IDE version. One individual with a similar project goal created a really cool script for processing.
I've downloaded and spent a small amount of time on it.


Week 7-9
Compatibility issues were resolved! In summary: I'm happy I purchased two headsets for my project. After tinkering
with the headset and getting nowhere, I took apart the second headset and soldered it up too, hoping I might have
simply run into some form of hardware failure. After hooking up the second headset, I've got raw CSV data coming
over the serial ports again, this time actually providing real data! I also spent some time digging through older
versions of processing and found that using version 2.2.1, the BrainGraph library is finally working. In summary,
with the basic IDE I can receive serial data but with the processing script (BrainGraph) I'm able to view a fully visualized graph
that displays the serial data (output as a CSV) in bands. These bands represent different energy levels of brain
activity.


Week 10
Some minor work, set up a rudimentary database. Found some interesting graphing programs:
chart.js, google charts, Highcharts.


Week 11
Graphing - Exploring more options to visualize my data on the web.



Week 12
Where has the time gone? I've lost track of what my project goals are and, starting last week, have begun building again
from the ground up. I have basic authentication and roles set up, which although late, feels like a big accomplishment.
Graphing is driving me crazy still. I spent a lot of time configuring the serial output data from the Mindflex headsets.
I found a nifty program called "Gobetwino" which captures live data from the arduino's serial output, provided
the arduino sketch is live, connected, and sending data. Saving this data is proving to be a severe setback.
I spent some time playing around with a new JQuery plugin called JQuery-CSV that could be a potential solution.


Week 13
Huge progress made this week on my project, including:
Database design, a little web site development, more user setup. I'm enjoying the web design portion of the project
more than I am the backend programming. Still very frustrated with graphing my data. My goal right now is to make
the project look good (and maybe it'll just work too?). For my web design I found a really awesome plugin called
vide.js that allows you to embed videos in your pages. As for finding videos,
http://www.videvo.net/ has been a great resource. I did manage to save my serial data using a program called
"CoolTermWin", so I'm going somewhere with it at least.



Week 15
I'm currently investigating whether or not Thingspeak (https://thingspeak.com) will work for data transmission
between the arduino and my application. Thingspeak sounded perfect until I read the write limits -
one data entry per channel every 15 seconds. This is a real problem since I receive the serial data once every second from
the mindflex headset. My current thinking is that I may be able to achieve some sort of round-robin logging
by creating several (15) independent channels. My problem then becomes how in the world do I display
that data? This might be another huge time investment that I can't really afford at the moment. I'm also playing around
with potentially logging every single serial read to my database using a tool called MySQL Connector/Arduino
(https://launchpad.net/mysql-arduino). I need to turn this:
80,0,0,915020,75621,25285,45944,40972,131545,129359,56605
into a database entry once every second.

UPDATE!
Using a program called "CoolTermWin" I'm able to grab every serial output from the Arduino, then using a little java code
I set up a FileInputStream and BufferedReader to loop through and grab the latest line of data.

Created BrainDao, BrainDaoTest for data storage

OK - not too sure what I'm doing adding Maven but I gave it a go since I wasn't able to add the correct version of
Javax.Servlet to my project.


