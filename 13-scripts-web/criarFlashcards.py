arquivo_entrada = 'vocabulario.txt' # arquivo contendo vocabulário
arquivo_saida = 'importar_anki.txt' # arquivo para importação no Anki

qntd_cards = 0

print(f"Criando flashcards a partir de '{arquivo_entrada}'...")

try:
    with open(arquivo_entrada, 'r', encoding='utf-8') as entrada, \
         open(arquivo_saida, 'w', encoding='utf-8') as saida:

        for linha in entrada:
            if ' - ' in linha:
                partes = linha.split(' - ', 1)
                
                termo = partes[0].strip() 
                definicao = partes[1].strip()  

                saida.write(f"{termo};{definicao}\n")
                
                qntd_cards += 1 

    print(f"\nSucesso! Foram criados {qntd_cards} cards no arquivo '{arquivo_saida}'.")
    print("Agora você já pode importá-lo no Anki ou outro app compatível.")
except FileNotFoundError:
    print(f"\nErro: O arquivo '{arquivo_entrada}' não foi encontrado.")
    print("Por favor, crie este arquivo no mesmo diretório do script com seu vocabulário.")
except Exception as e:
    print(f"\nOcorreu um erro inesperado: {e}")