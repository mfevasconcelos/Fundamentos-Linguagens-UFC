import threading
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


# --- Execução Concorrente ---
print("\n--- MODO CONCORRENTE (TODOS AO MESMO TEMPO) ---")
inicio_concorrente = time.time()

thread1 = threading.Thread(target=verificar_antivirus)
thread2 = threading.Thread(target=baixar_atualizacoes)
thread3 = threading.Thread(target=realizar_backup)

thread1.start()
thread2.start()
thread3.start()

thread1.join()
thread2.join()
thread3.join()

fim_concorrente = time.time()
print(f"\nTempo total da execução concorrente: {round(fim_concorrente - inicio_concorrente, 2)} segundos.")