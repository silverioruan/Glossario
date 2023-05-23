-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 23-Maio-2023 às 18:11
-- Versão do servidor: 10.4.27-MariaDB
-- versão do PHP: 8.0.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `glossario`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `terminologias`
--

CREATE TABLE `terminologias` (
  `idterminologias` int(11) NOT NULL,
  `nome` varchar(45) DEFAULT NULL,
  `descricao` text DEFAULT NULL,
  `sinonimo` varchar(45) DEFAULT NULL,
  `idcategoria` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Extraindo dados da tabela `terminologias`
--

INSERT INTO `terminologias` (`idterminologias`, `nome`, `descricao`, `sinonimo`, `idcategoria`) VALUES
(1, 'ovo', 'sai da galinha', 'ovo2', 1),
(2, 'switch', 'teste', 'teste2', 2),
(3, 'auto complite', 'O \"auto complete\" em Java é uma funcionalidade fornecida por algumas IDEs (Integrated Development Environments, ou Ambientes de Desenvolvimento Integrado) que ajuda os desenvolvedores durante a programação. Ele automaticamente sugere completar o código enquanto o desenvolvedor está digitando, com base nas informações do contexto e nas bibliotecas disponíveis.', 'autocomplite', 3);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `terminologias`
--
ALTER TABLE `terminologias`
  ADD PRIMARY KEY (`idterminologias`),
  ADD KEY `fk_terminologias_categoria1_idx` (`idcategoria`);

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `terminologias`
--
ALTER TABLE `terminologias`
  ADD CONSTRAINT `fk_terminologias_categoria1` FOREIGN KEY (`idcategoria`) REFERENCES `categoria` (`idcategoria`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
