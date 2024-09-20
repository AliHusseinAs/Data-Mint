import pandas as pd

df = pd.read_csv('data.csv')

df_cleaned = df[(df != 0).all(axis=1)]

df_cleaned.to_csv('cleaned_file.csv', index=False)

print(df_cleaned)
