Functional requirements:
Multiple elevators, multiple floors.
External call: person on floor F presses UP/DOWN.
Internal call: person inside elevator presses floor F.
Elevator moves, opens/closes doors, serves stops.

Non functional requirements:
The system should be able to handle multiple simultaneous requests.
Thread-safe (concurrent calls).
Idempotent (same button press twice = same effect).
No starvation (every floor eventually served).
Fault-tolerant (one elevator dies → others take over).