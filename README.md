# Project - *Twitter Client*

**Twitter Client** is an android app that allows a user to view his Twitter timeline. The app utilizes [Twitter REST API](https://dev.twitter.com/rest/public).

Time spent: **13** hours spent in total

## User Stories

The following **required** functionality is completed:

- [ ] User can **sign in to Twitter** using OAuth login
- [ ]	User can **view tweets from their home timeline**
  - [ ] User is displayed the username, name, and body for each tweetClass
  - [ ] User is displayed the [relative timestamp](https://gist.github.com/nesquena/f786232f5ef72f6e10a7) for each tweetClass "8m", "7h"
- [ ] User can refresh tweets timeline by pulling down to refresh

The following **optional** features will be implemented later on:

- [ ] User can view more tweets as they scroll with infinite pagination
- [ ] User can tap a tweetClass to display a "detailed" view of that tweetClass
- [ ] User can open the twitter app offline and see last loaded tweets
- [ ] On the Twitter timeline, leverage the CoordinatorLayout to apply scrolling behavior that hides / shows the toolbar.
- [ ] Replace all icon drawables and other static image assets with [vector drawables](http://guides.codepath.com/android/Drawables#vector-drawables) where appropriate.
- [ ] User can see embedded image media within the tweetClass detail view
- [ ] User sees an **indeterminate progress indicator** when any background or network task is happening
- [ ] User can **see embedded image media within a tweetClass** on list or detail view.
- [ ] User can **click a link within a tweetClass body** on tweetClass details view. The click will launch the web browser with relevant page opened.
- [ ] User can view following / followers list through any profile they view.
- [ ] User is using **"Twitter branded" colors and styles**


## Video Walkthrough

Here's a walkthrough of implemented user stories:

![Igmur](https://i.imgur.com/PKzV8g1.gif)

GIF created with [LiceCap](http://www.cockos.com/licecap/).

## Notes

The only problem i had building this app was that OAuth was not working as should. I first thought the it was an intent issue but i later realized that there were some unneccessary spaces in my API key.
## Open-source libraries used

- [Android Async HTTP](https://github.com/loopj/android-async-http) - Simple asynchronous HTTP requests with JSON parsing
- [Glide](https://github.com/bumptech/glide) - Image loading and caching library for Android

## License

    Copyright [yyyy] [name of copyright owner]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
