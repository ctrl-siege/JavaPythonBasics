candidates = [0,0,0,0,0]
winningVotes = 0
isTied = False
winner = 0

for i in range(20):

    vote = int(input())

    if vote < 1  or vote > 5:
        vote = input("Invalid Vote: ")

    index = vote-1
    candidates[index] += 1

for i in range(5):

    print(f"Candidate {i+1}: {candidates[i]} votes")

    if winningVotes == candidates[i]:
        isTied = True
        continue

    if winningVotes < candidates[i] or winner == 0:
        isTied = False
        winningVotes = candidates[i]
        winner = i+1

if isTied:
    print("\nTie detected")
else:
    print(f"\nWinner: Candidate {winner}")