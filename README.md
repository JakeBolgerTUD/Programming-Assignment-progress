# Programming-Assignment-progress
Programming assignment machine learning model using Naive Bayes. CoronaVirus diagnostic tool to show how likely someone is to have the virus or not.

In this program there are four classes. The GUI class uses JRadioButtons to allow the user to select the symptoms and has a button to check the probability of the symptoms.
The Control class calls the GUI so it can display it.
The FileMaster class reads in a csv file containing data for the patients symptoms. I've used bubfferedReader to do this.
The NaiveBayes class does all the calculations using Naive Bayes. It counts all the probabilities needed to calculate the probability and stores them in variables to be used. It does this by splitting the csv file into an arraylist and accessing all the elements. it then stores all the probabilities in variables deoending on what the user has selected and then using the Naive Bayes algorithm it returns the probability.

**NOTE: GUI does not Fully Function and practicearray class is not part of program**
Jake Bolger
C18395341
