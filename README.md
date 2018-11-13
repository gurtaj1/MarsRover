## Background

Since I come from a React background, and this project is written in Java, I initially thought that this test was sent to me by mistake. I asked my agent to check with the company as to whether this is the right test and whether it comes with any guidelines. The company got back and said it is indeed the right test, and that there are no guidelines. I then figured that this test will depend on my ability to research and adapt. I have only one prior experience with Java and that was helping a QA (directing rather than flicking through the files myself) in my old job to locate a css selector that needed changing within a Java test.

## Method

#### Setting up the workspace

So I opened the project with VSCode and began to look through the different files. I thought maybe there were some hidden guidlines but I still did not find anything. I then began to google 'Mars Rover Java' (not to cheat but rather to get some context).

I came across this [website](https://veerasundar.com/blog/2010/06/mars-rover-in-java/). After reading through the introduction I realised that the Java project I was given had almost the exact same setup. Things like setting up a plateau grid, turning anti-clockwise and clockwise with 'L' and 'R' respectively, moving one grid-point forward with 'M', and 'N', 'E', 'S, and 'W' representing their abbreviated compass directions. I still did not know what I was supposed to do but I thought why not see if I can run the project and see if that gives me any clues.

I found a command from a google search: `java <filename>`. This then lead me to discover that I did not have Java installed. I proceeded to install Java, after which the command now worked! (with a bit of practice on how to properly select the Main class). This confirmed what I had already suspected `System.out.println` was meant to do. It gave me the final position of the rover. I was already satisfied that the rover movement functions were setup as they should be but I decided to hand-draw a grid and follow the paths of the rovers myself just to make sure the result were what I would expect.

I then tried to edit the movement made by the pre-existing rovers. I ran the code, but there was no change. I was well aware that I was only changing the source code (`Main.java`), and that further work needed to be done in order the change `Main.class`, the file which I had gathered was the one actually being executed.

When googling what commands to use to run the project I had come across a package known as eclipse. It seemed that this was very popular and was designed specifically for working on Java projects. I proceeded to download and install. Upon installing it turned out that I now needed to install the Java Development Kit. I did so and then finally I was ready to go! Eclipse was letting me change the source code and then run it with the changes correctly implemented (I assume there is some sort of build magic going on in the background haha).

#### Searching the rest of the Plateau

From the googling I had already done on this problem, a commonality I noticed was that there was a goal to search the entire grid. I went ahead and set out to do this and convinced myself that it was enough to complete this test.

**Assumptions made:**
- My rover is a new and improved rover that does not run out of fuel.
- My rover can move just as freely as the previous two rovers.

Initially I made a new rover that simply started at one corner of the grid and traversed the whole entire grid line-by-line. This seemed ok but I pictured the physical aspects of this and realised that one rover could not really drive straight through another rover. I got rid of the previous two rovers but then changed my mind and brought them back. Instead I made my new rover traverse all the grid points which had not yet been covered by the previous two rovers. I made especially sure not to cross the current positions of the previous two rovers.

## Summary

As you may have gathered from the breakdown of the method I took to complete this test, the hardest part was setting up my workspace so that I could successfully edit and run a Java project. As far as actually making changes to the project and acheiving an end goal, I am not totally satisfied as the whole thing was essantially an assumption (or a slightly-google-educated guess).

I hope this explains all the steps I have taken clearly enough for the reader to make an informed decision on my current ability in coding (or perhaps even programming?).

Thank you for reading.