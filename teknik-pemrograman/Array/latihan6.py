skor = []
average = 0;

for i in range(5):
    skor.append(int(input("Masukkan skor ke-" + str(i + 1) + " : ")))
    average = average + skor[i]

average = average / 5
print("Rata-rata skor adalah", average)
