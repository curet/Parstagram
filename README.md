# Project 3 - Parstagram - Part 2

**Parstagram** is a photo sharing app similar to Instagram but using Parse as its backend.

Time spent: **10** hours spent in total

## User Stories

The following **required** functionality is completed:

- [x] User can view the last 20 posts submitted to "Instagram".
- [x] The user should switch between different tabs - viewing all posts (feed view), compose (capture photos form camera) and profile tabs (posts made) using fragments and a Bottom Navigation View. (2 points)
- [x] User can pull to refresh the last 20 posts submitted to "Instagram".

The following **optional** features are implemented:

- [x] User sees app icon in home screen and styled bottom navigation view
- [ ] Style the feed to look like the real Instagram feed.
- [ ] User can load more posts once he or she reaches the bottom of the feed using infinite scrolling.
- [ ] Show the username and creation time for each post.
- [ ] User can tap a post to view post details, including timestamp and caption.
- [ ] User Profiles
      - [ ] Allow the logged in user to add a profile photo
      - [ ] Display the profile photo with each post
      - [ ] Tapping on a post's username or profile photo goes to that user's profile page and shows a grid view of the user's posts 
- [ ] User can comment on a post and see all comments for each post in the post details screen.
- [ ] User can like a post and see number of likes for each post in the post details screen.

The following **additional** features are implemented:

- [ ] List anything else that you can get done to improve the app functionality!

## Video Walkthrough

Here's a walkthrough of implemented user stories:

### Home View

<img src="https://user-images.githubusercontent.com/45988719/161352569-f1bf502d-1657-4ed9-9e6a-6941914464f8.gif" width=250><br>

### Compose View

<img src="https://user-images.githubusercontent.com/45988719/161352672-e8d4dbde-b9d1-4223-bb15-487434a57881.gif" width=250><br>

### Profile View

<img src="https://user-images.githubusercontent.com/45988719/161352779-0cf6fe2c-cf45-417f-9d6c-f3809cc99e97.gif" width=250><br>

### All Views

<img src="https://user-images.githubusercontent.com/45988719/161352903-f05de6ed-57ca-411f-8561-8fb467fc1282.gif" width=250><br>

### Fetch 20 Posts

<img src="https://user-images.githubusercontent.com/45988719/161463414-8f08defc-acce-4264-9538-887873603d4a.gif" width=250><br>

## Notes

This was a nice project to implement. I plan on continue with the optional features but wanted to make sure to at least submit the required ones first.


# Project 3 - Parstagram - Part 1

**Parstagram** is a photo sharing app similar to Instagram but using Parse as its backend.

Time spent: **20** hours spent in total

## User Stories

The following **required** functionality is completed:

- [x] User can sign up to create a new account using Parse authentication.
- [x] User can log in and log out of his or her account.
- [x] The current signed in user is persisted across app restarts.
- [x] User can take a photo, add a caption, and post it to "Instagram".

The following **optional** features are implemented:

- [ ] User sees app icon in home screen and styled bottom navigation view
- [ ] Style the feed to look like the real Instagram feed.
- [ ] After the user submits a new post, show an indeterminate progress bar while the post is being uploaded to Parse.

The following **additional** features are implemented:

- [ ] List anything else that you can get done to improve the app functionality!

## Video Walkthrough

Here's a walkthrough of implemented user stories:

### User Sign up

<img src="https://user-images.githubusercontent.com/45988719/160292888-fb017002-b44b-4db6-b12b-7ef98ca94d7b.gif" width=250><br>

### User Sign in

<img src="https://user-images.githubusercontent.com/45988719/160292960-9593dd0e-4dbf-443e-958b-012aea7b8df1.gif" width=250><br>

### Submit Picture + Description

<img src="https://user-images.githubusercontent.com/45988719/160292815-770355e0-d94c-4d45-a3e3-fc4835dc862d.gif" width=250><br>

## Notes

I had tons of issues finishing this app, with dependencies, libraries and random things that occurred, strangely this made me love even more mobile development 😅.

## Open-source libraries used

- [Android Async HTTP](https://github.com/codepath/CPAsyncHttpClient) - Simple asynchronous HTTP requests with JSON parsing
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
