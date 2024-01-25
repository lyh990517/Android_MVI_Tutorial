# Android Counter App - MVI Architecture

MVI (Model-View-Intent) is an architectural pattern that clearly defines states and events for modeling user interfaces. This architecture focuses on processing user interactions as events and updating the UI by changing the state.

## Core Components

### Reducer
- The Reducer is a core class that handles the state (`UiState`) and events (`UiEvent`).
- It maintains the current state and generates a new state in response to events to update the UI.

### MainReducer
- Inherits from `Reducer` and handles `MainState` and `MainEvent`.
- `reduce` method:
  - The `Increase` event increases the value of the `data` in the state.
  - The `Decrease` event decreases the value of `data`.

### MainState
- A data class representing the state of the counter.
- `data`: Stores the current value of the counter.

### MainEvent
- A `sealed` class representing events of the counter.
- Two types of events: `Increase` and `Decrease`.

### MainViewModel
- Connects the UI with the Reducer.
- Transmits events to the `Reducer` and relays the state from the `Reducer` to the UI.

### MainActivity
- An Android activity that sets up the UI and interacts with the UI using `MainViewModel`.

## How It Works

1. The user triggers an `Increase` or `Decrease` event through the UI.
2. `MainViewModel` passes this event to the `MainReducer`.
3. `MainReducer` changes the `MainState` based on the event.
4. The updated `MainState` is reflected in the UI, visible to the user.
