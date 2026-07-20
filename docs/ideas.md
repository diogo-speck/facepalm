BrainStorm

facepalm Tap
O jogador ganha pontos de três formas:

👆 Toque na tela [+1 clique]
📳 Chacoalhando o celular (acelerômetro) [+5 cliques]
🤦 Aproximando a mão/testa (sensor de proximidade) [+10 cliques]

melhorias:

+1 por clique
multiplicadores
melhorias dos sensores
bônus temporários

Tudo fica salvo na nuvem (Banco de dados)


Android (RecyclerView, Threads, HTTP e Banco local)
│
├── Java (Android SDK + Java)
├── Android Studio
├── Material Design
├── Room Database (cache offline)
└── Retrofit

↓

Backend

Spring Boot
    POST /login

    POST /register

    GET /player

    PUT /player

    GET /shop

    POST /buy

    GET /ranking

    POST /save

Java
PostgreSQL

↓

Banco

PostgreSQL (Tabelas)
    Player: id,nome,ouro,nivel,cliques e moedas
    ShopItem: id,nome,preco e bonus (+1 clique,x2,Sensor Plus,Super Shake, etc)
    Inventory: player_id e item_id
    Achievements: id,titulo,descricao

↓

Frontend Web

HTML
CSS
JavaScript

(consome a mesma API)


Missões
    Diárias/Semanais
        ex. Clique X vezes; Faça Y shakes;
        Prizes: Gold, Cristal, Skins, etc 

Achievements
    Primeiro clique; X Cliques; Millionaire; Top Ranking

Temas
    Espaço/Piratas/Medieval/Cyberpunk/Fazenda

UPCOMING?
    guildas
    eventos semanais
    PvP indireto (quem faz mais pontos)
    sistema de pets
    temporadas
    skins
    marketplace
    sincronização em tempo real
    notificações push



Organização do projeto MonoRepo/FullStack

FacePalm/

    android/app/src/main/java/com/example/facepalmgame (o aplicativo mobile em si)

        activities/ (Telas)

        model/ (Objetos)

        network/ (API)

        manager/ (lógica)

        repository/

        database/

        sensor/

        ui/

        utils/


    backend/ (futuro servidor com banco de dados)

    web/ (versão web)

    docs/ (arquivos para se organizar)

    shared/ (arquivos compartilhados entre android e web)

    README.md




Ordem de desenvolvimento recomendada:
1. Criar o projeto Android em Java.
2. Implementar o clique básico e o contador local.
3. Integrar os sensores (acelerômetro e proximidade).
4. Criar a loja e os upgrades.
5. Salvar o progresso localmente com Room.
6. Desenvolver a API em Spring Boot e PostgreSQL.
7. Sincronizar os dados do jogo com o servidor.
8. Criar a versão web consumindo a mesma API.
9. Adicionar ranking, conquistas e missões.
10. Polir a interface, animações e efeitos sonoros.