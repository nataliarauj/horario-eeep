-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Tempo de geração: 25-Maio-2020 às 04:14
-- Versão do servidor: 10.4.10-MariaDB
-- versão do PHP: 7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `escola`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `admin`
--

DROP TABLE IF EXISTS `admin`;
CREATE TABLE IF NOT EXISTS `admin` (
  `login` varchar(30) DEFAULT NULL,
  `senha` varchar(30) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `admin`
--

INSERT INTO `admin` (`login`, `senha`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Estrutura da tabela `aulas1`
--

DROP TABLE IF EXISTS `aulas1`;
CREATE TABLE IF NOT EXISTS `aulas1` (
  `id` int(2) NOT NULL AUTO_INCREMENT,
  `nome` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=33 DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `aulas2`
--

DROP TABLE IF EXISTS `aulas2`;
CREATE TABLE IF NOT EXISTS `aulas2` (
  `id` int(2) NOT NULL AUTO_INCREMENT,
  `nome` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `aulas3`
--

DROP TABLE IF EXISTS `aulas3`;
CREATE TABLE IF NOT EXISTS `aulas3` (
  `id` int(2) NOT NULL AUTO_INCREMENT,
  `nome` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `aulas4`
--

DROP TABLE IF EXISTS `aulas4`;
CREATE TABLE IF NOT EXISTS `aulas4` (
  `id` int(2) NOT NULL AUTO_INCREMENT,
  `nome` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `aulas5`
--

DROP TABLE IF EXISTS `aulas5`;
CREATE TABLE IF NOT EXISTS `aulas5` (
  `id` int(2) NOT NULL AUTO_INCREMENT,
  `nome` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `aulas6`
--

DROP TABLE IF EXISTS `aulas6`;
CREATE TABLE IF NOT EXISTS `aulas6` (
  `id` int(2) NOT NULL AUTO_INCREMENT,
  `nome` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `aulas7`
--

DROP TABLE IF EXISTS `aulas7`;
CREATE TABLE IF NOT EXISTS `aulas7` (
  `id` int(2) NOT NULL AUTO_INCREMENT,
  `nome` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `aulas8`
--

DROP TABLE IF EXISTS `aulas8`;
CREATE TABLE IF NOT EXISTS `aulas8` (
  `id` int(2) NOT NULL AUTO_INCREMENT,
  `nome` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `aulas9`
--

DROP TABLE IF EXISTS `aulas9`;
CREATE TABLE IF NOT EXISTS `aulas9` (
  `id` int(2) NOT NULL AUTO_INCREMENT,
  `nome` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `aulas10`
--

DROP TABLE IF EXISTS `aulas10`;
CREATE TABLE IF NOT EXISTS `aulas10` (
  `id` int(2) NOT NULL AUTO_INCREMENT,
  `nome` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `disciplinas`
--

DROP TABLE IF EXISTS `disciplinas`;
CREATE TABLE IF NOT EXISTS `disciplinas` (
  `id` int(2) NOT NULL AUTO_INCREMENT,
  `nome` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=57 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `disciplinas`
--

INSERT INTO `disciplinas` (`id`, `nome`) VALUES
(1, 'Redação'),
(2, 'Biologia II'),
(3, 'Inf. Básica'),
(4, 'Empreendedorismo'),
(5, 'História'),
(6, 'Literatura'),
(7, 'Espanhol'),
(8, 'Gramática'),
(9, 'Matemática I'),
(10, 'Matemática II'),
(11, 'Biologia I'),
(12, 'Química'),
(13, 'Atualidades'),
(14, 'Inglês'),
(15, 'Sociologia'),
(16, 'PV'),
(17, 'Geografia'),
(18, 'Física'),
(19, 'Ed. Física'),
(20, 'Artes'),
(21, 'FC'),
(22, 'Filosofia'),
(23, 'MT'),
(24, 'Prof. Formação'),
(25, 'Gestão do tempo'),
(26, 'Invest. Infor.'),
(27, 'P. T. S I'),
(28, 'Flauta I'),
(29, 'Regência V'),
(30, 'Int. Curso'),
(31, 'P.P.V. Saúde'),
(32, 'I. P. L . B '),
(33, 'Polit. Saúde'),
(34, 'A. F. H. B'),
(35, 'Inglês Técnico'),
(36, 'Adm. Redes'),
(37, 'Int. Profissionais'),
(38, 'S.O'),
(39, 'S. M. A. A. I'),
(40, 'S. H. A. A. I'),
(41, 'S.C. Escolar'),
(42, 'Saúde Mental'),
(43, 'P. R. Exames'),
(44, 'Semiologia'),
(45, 'Flauta'),
(46, 'Lab. Práticas II'),
(47, 'P. T. S III'),
(48, 'Regência III'),
(49, 'Lab. Web'),
(50, 'Lab. Software'),
(51, 'Lab. Hardware'),
(52, 'P. Cirúrgico'),
(53, 'P. Crítico'),
(54, 'P. T. S V'),
(55, 'Flauta V'),
(56, 'lab. Práticas IV');

-- --------------------------------------------------------

--
-- Estrutura da tabela `professores`
--

DROP TABLE IF EXISTS `professores`;
CREATE TABLE IF NOT EXISTS `professores` (
  `id` int(2) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `endereco` varchar(50) DEFAULT NULL,
  `celular` varchar(11) DEFAULT NULL,
  `telefoneFixo` varchar(10) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `rg` varchar(11) DEFAULT NULL,
  `cpf` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `professores`
--

INSERT INTO `professores` (`id`, `nome`, `endereco`, `celular`, `telefoneFixo`, `email`, `rg`, `cpf`) VALUES
(1, 'Kaio', 'sadsadasdas', '', '', 'wdsdasdasda', '757575', '75757575');

-- --------------------------------------------------------

--
-- Estrutura da tabela `turmas`
--

DROP TABLE IF EXISTS `turmas`;
CREATE TABLE IF NOT EXISTS `turmas` (
  `id` int(2) NOT NULL AUTO_INCREMENT,
  `nome` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `turmas`
--

INSERT INTO `turmas` (`id`, `nome`) VALUES
(1, '1º A'),
(2, '1º B'),
(3, '1º C'),
(4, '1º D'),
(5, '2º A'),
(6, '2º B'),
(7, '2º C'),
(8, '3º A'),
(9, '3º B'),
(10, '3º C');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
