// dados de entrada imutaveis
const DADOS_USUARIOS = [
  {
    id: 1,
    nome: "Victor Manoel",
    idade: 23,
    cidade: "São Paulo",
    ativo: true,
    habilidades: ["JavaScript", "React", "CSS"]
  },
  {
    id: 2,
    nome: "Maria Fernanda",
    idade: 20,
    cidade: "Rio de Janeiro",
    ativo: false,
    habilidades: ["Python", "Django", "SQL"]
  },
  {
    id: 3,
    nome: "Ana Thalita",
    idade: 22,
    cidade: "São Paulo",
    ativo: true,
    habilidades: ["JavaScript", "Vue", "Node.js", "SQL"]
  },
  {
    id: 4,
    nome: "Felipe Matos",
    idade: 41,
    cidade: "Belo Horizonte",
    ativo: true,
    habilidades: ["Java", "Spring", "SQL"]
  },
  {
    id: 5,
    nome: "Eduarda Soares",
    idade: 31,
    cidade: "São Paulo",
    ativo: false,
    habilidades: ["Python", "Data Science", "Pandas"]
  }
];

//soluções com funções de alta ordem

const ehAtivo = (usuario) => usuario.ativo === true;
const encontrarUsuariosAtivos = (usuarios) => usuarios.filter(ehAtivo);

const extrairNomeEIdade = (usuario) => ({ nome: usuario.nome, idade: usuario.idade });
const mapearParaNomesEIdades = (usuarios) => usuarios.map(extrairNomeEIdade);

const calcularIdadeMedia = (usuarios) => {
  if (usuarios.length === 0) return 0;
  
  const somaDasIdades = usuarios
    .map(usuario => usuario.idade)
    .reduce((soma, idade) => soma + idade, 0);
    
  return somaDasIdades / usuarios.length;
};

const encontrarNomesDeUsuariosDeSPComSQL = (usuarios) => {
    return usuarios
        .filter(u => u.cidade === "São Paulo")
        .filter(u => u.habilidades.includes("SQL"))
        .map(u => u.nome);
}

//solução com recursão

const contarHabilidadesDeUmUsuario = (usuario) => usuario.habilidades.length;

const contarTotalHabilidadesRecursivo = (usuarios) => {
  if (usuarios.length === 0) {
    return 0;
  }
  const primeiroUsuario = usuarios[0];
  const restoDosUsuarios = usuarios.slice(1);
  
  return contarHabilidadesDeUmUsuario(primeiroUsuario) + contarTotalHabilidadesRecursivo(restoDosUsuarios);
};

const contarTotalHabilidadesComHOFs = (usuarios) => {
  return usuarios
    .map(usuario => usuario.habilidades.length)
    .reduce((soma, contagem) => soma + contagem, 0);
};

console.log("Encontrar usuários ativos");
const usuariosAtivos = encontrarUsuariosAtivos(DADOS_USUARIOS);
console.log(JSON.stringify(usuariosAtivos, null, 2));
console.log("\n");

console.log("Mapear para Nomes e Idades");
const nomesEIdades = mapearParaNomesEIdades(DADOS_USUARIOS);
console.log(JSON.stringify(nomesEIdades, null, 2));
console.log("\n");

console.log("Calcular a Idade Média de Usuários");
const idadeMedia = calcularIdadeMedia(DADOS_USUARIOS);
console.log(`A idade média dos usuários é: ${idadeMedia}`);
console.log("\n");

console.log("Nomes de usuários de São Paulo com SQL");
const usuariosDeSPComSQL = encontrarNomesDeUsuariosDeSPComSQL(DADOS_USUARIOS);
console.log(usuariosDeSPComSQL);
console.log("\n");

console.log("Contar total de habilidades");
const totalHabilidadesRecursao = contarTotalHabilidadesRecursivo(DADOS_USUARIOS);
console.log(`Total de habilidades (recursão): ${totalHabilidadesRecursao}`);

const totalHabilidadesHOF = contarTotalHabilidadesComHOFs(DADOS_USUARIOS);
console.log(`Total de habilidades (HOFs):     ${totalHabilidadesHOF}`);
console.log("\n");