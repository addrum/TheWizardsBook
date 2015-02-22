# The Wizard's Book

The Wizard's Book is a 3 level game created in Netbeans with Java as part of a module in my first year of university. It was built in 3-4 weeks using some Java features which are explained below. Please feel free to download the source files using the button to the right. Below is an excerpt from a critical evaluation essay required as part of the module.

An initial possibility to implement sound into my game was to have it within the Game class constructor in order for it to be played when the game is started. This would have been done by creating a new <em>SoundClip </em>object with a reference to the path of the sound clip. This would then be surrounded by a try-catch block in order the throw the <em>IOEXception</em>, <em>UnsupportedAudioFileException </em>and <em>LineUnavailableException</em>. I quickly realised this was not good object oriented design.

A better object oriented design would be to separate the sound and its objects into its own class. This would enable me to create a new Sound object in whichever class I needed in order to change the sound. To do this, the constructor would have the parameter of a String which would be the path to file. When a Sound object is created, then the path reference would be used, and then the object would call either a play method or a loop method depending on the situation. For the soundtrack to be played, the object would call loopSound which would keep it playing until the game closes. I also set up the class so that I could use polymorphism in order to change which sound was being played and at what time.

Implementing the AI into the game also gave multiple possibilities for implementation. My first idea was to create a class for the bat itself in order to include object oriented design and als a clearer concept to work with. Getting the bat to follow the player was difficult as I tried different ways such as calling the bat to move to the player within the Player class. Having the bat move randomly using the Math.random method and also calling the bat to move within the Game or individual Level classes.

I quickly spotted that this was not object oriented design and decided to include everything related to moving the bat within the Bat class too, and create an object of the bat in which level I needed. I also found that the best solution was using the inbuilt StepListener interface. This would allow me to update the bats position each time a “step” has been made.

While it may appear in the video that the game stops at points of collision, this is not the case. The game displays a jOptionPane which the recording software unfortunately did not record.

https://www.youtube.com/watch?v=0TqprzoDzsI