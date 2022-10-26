<h1>Welcome to StringsCreator Application</h1>

<h3> Description </h3>

Application enables users to generate random and unique strings. User need to provide information in correct format.
It is shown below:

Request format:
````
{
"min": "1",
"max": "3",
"chars": "abc",
"numberOfStrings": "10"
}
````
It should be included when requesting Post method using e.g. Postman on below url:

>http://localhost:8080/generate
> 
>
File will be saved to your local path : 

>C:\GeneratedStrings

with name 

>YourStrings{index}.txt

Where {index} will be incremented each time new file is created.

<h3>Author</h3>

Piotr Boczar
