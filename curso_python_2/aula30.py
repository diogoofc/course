"""
CONSTANTE = "Variáveis" que não vão mudar
Muitas condições no mesmo if (ruim)
    <- Contagem de complexidade (ruim)
"""
velocidade = 61 # velocidade atuaç do carro
local_carro = 101 # local em que o carro está na estrada

RADAR_1 = 60 # velocidade máxima do radar 1 
LOCAL_1 = 100 # local onde o radar 1 está
RADAR_RANGE = 1 # a distância onde o radar pega 

velocidade_carro_passou_radar_1 = velocidade > RADAR_1
carro_multado = local_carro >= (LOCAL_1 - RADAR_RANGE)
local_carro = local_carro <= (LOCAL_1 + RADAR_RANGE)
carro_passou_radar_1 =  carro_multado and velocidade_carro_passou_radar_1


if carro_passou_radar_1 :
    print('Carro passou no radar 1')

if velocidade_carro_passou_radar_1:
    print('Você passou do limite de velocidade.')

if carro_multado and velocidade_carro_passou_radar_1:
    print('Você foi multado')