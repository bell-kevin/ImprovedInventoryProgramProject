# ImprovedInventoryProgramProject
SDEV 2210 Project. You created an inventory program in Ch 9 using an array with size of 2. As you’ve learned, when you don’t know how big an array needs to be, it’s better to use an array list. Make a COPY of the Ch 9 inventory project and change it to use an array list.  Does anything need to change in the inventory class? Nothing – all the same variables and methods are needed.  Does anything need to change in the driver class? No, because we are still working with a store that has inventory.  The class for the store needs to change, from using an array of size 2 for the inventory items for the store, to an ArrayList of unknown size for the inventory items. Because the array had a known size, you probably used a For loop to go through the array to add inventory items. In this version, you need to ask the user if they want to continue adding more inventory items, and repeat that work if the answer is “yes”.  In the Ch 9 version, you created a method to find an item in inventory, which returned the index number for that object in the inventory array. If the name of the array was “items”, you referenced an inventory item like this: items[k]. Since this version uses an array list, you can’t use the name with an index like that – you have to use the “get” method, items.get(k). You can chain other methods to it, like the sell method. You will probably need to make changes in the find and sell methods you created to access the elements in the array list instead of in the array.  When the program runs, it should ask the user for inventory information, and ask if they want to continue to add more inventory, instead of asking for 2 items and no more. Thus the user can enter any number of items. Otherwise, the program should appear to behave exactly the same as it did in Ch 9.


== We're Using GitHub Under Protest ==

This project is currently hosted on GitHub.  This is not ideal; GitHub is a
proprietary, trade-secret system that is not Free and Open Souce Software
(FOSS).  We are deeply concerned about using a proprietary system like GitHub
to develop our FOSS project.  We have an
[open {bug ticket, mailing list thread, etc.} ](INSERT_LINK) where the
project contributors are actively discussing how we can move away from GitHub
in the long term.  We urge you to read about the
[Give up GitHub](https://GiveUpGitHub.org) campaign from
[the Software Freedom Conservancy](https://sfconservancy.org) to understand
some of the reasons why GitHub is not a good place to host FOSS projects.

If you are a contributor who personally has already quit using GitHub, please
[check this resource](INSERT_LINK) for how to send us contributions without
using GitHub directly.

Any use of this project's code by GitHub Copilot, past or present, is done
without our permission.  We do not consent to GitHub's use of this project's
code in Copilot.

![Logo of the GiveUpGitHub campaign](https://sfconservancy.org/img/GiveUpGitHub.png)
