# Returns Calculator ?
BestDeals Bank wants to build a Returns calculator for its bankers by subtracting the outflows from the inflows from each deal, ignoring the timings of the cashflow in the first release. To start off, the returns calculator will allow the user to calculate the returns for the following kind of deals

Simple Compound Interest, Return

![Simple CI ](returns_calculator/src/main/resources/images/SimpleCI.png "Simple CI")

Annual Simple Interest, return

```
   I = P * r * N
```

The returns should multiplied with the currency’s Fx Rate to USD to calculate the $ returns. The tool should be extensible so that it can calculate the returns of a number of different kinds of deals with different inputs. The tool will also allow users to dynamically calculate the returns for every client by accumulating the returns in dollars across all its deals.
Please design and deliver a persistent server-side Java application with appropriate RESTFul Webservices for such an application. The solution will be graded on the basis of its design extensibility, Unit Testing, code quality, performance and appropriate usage of latest java developments.
Please bring a running application, code and unit tests to the interview for consideration for the role.



### How to run the `Returns Calculator`


```
$  mvn spring-boot:run

```

### Returns Calculator UI.

* [ReturnsCalculator](http://localhost:8080) .

