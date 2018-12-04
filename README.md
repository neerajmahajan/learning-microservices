##### Microservices
* The microservice architectural style is an approach to developing a single application as a suite of small services.
* These services are built around business capabilities and are independently deployable.
* There is a bare mininum of centralized management of these services, which may be written in different programming languages.
* A microservice is a small, independent, self-contained service.
* It is an independently deployable unit of functionality.
* A microservice application is a collection of autonomous services, each of which does one thing well, that work together to perform more intricate operations.
* These services collaborate with each other through technology-agnostic messaging protocols, either point-to-point or asynchronously
* To deliver value with microservices, we needed to be skilled at operations: deployment, observation,and diagnosis.
* Cohesion is the degree to which elements of a certain module belong together, whereas coupling is the degree to which one element knows about the inner workings of another.
* A single microservice should be highly cohesive: it should be responsible for some single capability within an application.
* Likewise, the less that each service knows about the inner workings of other services, the easier it is to make changes to one service—or capability—without forcing
changes to others.

##### Monolithik problems
* New developers spend more time comprehending the existing system/code and less time adding product value.
* If scalling is required, then all parts of application get scalled.
* If multiple features are included in a release, then a failure of single feature will cause rollback of other features as well.

#### Benefits
* Whole system more maintaineable.
*
