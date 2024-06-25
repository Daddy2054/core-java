// Description of Context Implementation to Use
// You are building a list that will hold results from a database query you are
// showing on the UI. You need to be able to quickly sort and filter the list
// but additions and removals are rare.
// ArrayList
// You are building the shopping cart feature for a website where the most
// recently added item is always added to the end. Shoppers frequently delete
// items from the middle of the list.
// LinkedList
// You are building a list to hold all the authors on your blog. Sometimes you
// get an email from one of them asking you update their name or linked social
// media but it’s rare you invite a new author to contribute.
// ArrayList
// For the first context, because the list is holding a database result without
// a lot of additions or removals, this would indicate ArrayList is the better
// choice. It’s also worth noting that if this list is behind a UI there will
// probably be a lot of get calls and sorts as the user changes display options,
// making ArrayList a much better choice.

// For the second context, because the list is a shopping cart, it is very
// important that items are reliably added or your employer loses revenue.
// Additionally, because those additions always happen at the end of the list
// and it is common for items in the middle of the list to be removed,
// LinkedList would be a better choice.

// For the third context, because there are few additions and removals,
// ArrayList is a good choice. Note that updating information in a list would be
// a set operation, not an addition, which ArrayList is fast at.