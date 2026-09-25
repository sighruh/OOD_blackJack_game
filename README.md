## Linear Search Preview

1. Where does this search begin?
   Does it start in the middle of the ArrayList, at the end, or at the beginning? 
    - The search begins in the beginning of the arrayList which starts at the index(0).
     
2. What is being compared during each pass through the loop?
   Identify the part of the Card object being compared with searchName.
    - The cardName is being compared to the searchName when it goes through the loop.
   
3. What does break do when a matching card is found?
   What would happen if the break were removed?
   - The break will stop the search once is has found the matching card.
   - If I were to remove the break it would simply prevent the search to stop even when the matching card has been found. 
   
5. Suppose the card you are searching for is the first card in an ArrayList containing 52 cards.
   How many Card objects would need to be checked?
   - 1 card object would need to be checked if the first card was the one I was searching for.

6. Suppose the card you are searching for is the last card in an ArrayList containing 52 cards.
   How many Card objects might need to be checked?
   - All 52 card objects would need to be checked if the last card was the one I was searching for.

7. Suppose the card you are searching for is not in the ArrayList at all.
   How many Card objects would the linear search need to check?
   - All 52 card objects would need to be checked even if the card I was searching for was not on the ArrayList. 

9. Why do you think this type of search is called a linear search?
   - The reason why it is called a linear search is because it needs to check one by one from the beginning to the end.
   - Starting from one point to an end. 

11. Based on this example, describe a linear search algorithm in your own words. Do not describe the Java syntax.
   Instead, explain the general process you would follow to find something using linear search.
   - So a linear search starts a the beginning of an arrayList and then searches each item.
   - It will go to each item and then compare it to the item that it needs to match.
   - Once it finds the item it will stop the search. If not it will keep going down the list until it finds the match.

Why was an equals() method needed for the Card objects?
- The reason why the equals() method was needed for the Card objects was because it helped the program compare two Card objects. Essentially it needed to make sure that the cardName and cardValue were the same regardless of CardSuit.  
