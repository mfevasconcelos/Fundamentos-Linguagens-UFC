import time

def verificar_antivirus():
    print("Iniciando verificação de antivírus...")
    time.sleep(3)
    print(">>> Verificação de antivírus concluída.")

def baixar_atualizacoes():
    print("Iniciando download de atualizações...")
    time.sleep(5)
    print(">>> Download de atualizações concluído.")

def realizar_backup():
    print("Iniciando backup de arquivos...")
    time.sleep(2)
    print(">>> Backup concluído.")

# --- Execução Sequencial ---
print("--- MODO SEQUENCIAL (UM DE CADA VEZ) ---")
inicio = time.time()

verificar_antivirus()
baixar_atualizacoes()
realizar_backup()

fim = time.time()
print(f"\nTempo total da execução sequencial: {round(fim - inicio, 2)} segundos.")