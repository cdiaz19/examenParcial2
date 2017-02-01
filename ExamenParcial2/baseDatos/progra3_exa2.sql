-- phpMyAdmin SQL Dump
-- version 4.5.4.1deb2ubuntu2
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 01-02-2017 a las 09:56:37
-- Versión del servidor: 5.7.17-0ubuntu0.16.04.1
-- Versión de PHP: 7.0.13-0ubuntu0.16.04.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `progra3_exa2`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `author`
--

CREATE TABLE `author` (
  `id_author` int(11) NOT NULL,
  `name` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `author`
--

INSERT INTO `author` (`id_author`, `name`) VALUES
(1, 'Garcia Marquez'),
(9, 'Garcia Marquez'),
(17, 'William Shakespeare'),
(18, 'William Shakespeare'),
(19, 'Garcia Marquez'),
(20, 'William Shakespeare'),
(21, 'Garcia Marquez');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `authorContact`
--

CREATE TABLE `authorContact` (
  `id_authorContact` int(11) NOT NULL,
  `id_author` int(11) NOT NULL,
  `contact` text NOT NULL,
  `type` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `authorContact`
--

INSERT INTO `authorContact` (`id_authorContact`, `id_author`, `contact`, `type`) VALUES
(1, 1, '22798952', 'Casa'),
(2, 9, '22798952', 'Casa'),
(3, 19, '22798952', 'Casa'),
(4, 21, '22798952', 'Casa');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `book`
--

CREATE TABLE `book` (
  `id_book` int(11) NOT NULL,
  `id_author` int(11) NOT NULL,
  `id_type` int(11) NOT NULL,
  `name` text NOT NULL,
  `dateRelease` date NOT NULL,
  `price` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `book`
--

INSERT INTO `book` (`id_book`, `id_author`, `id_type`, `name`, `dateRelease`, `price`) VALUES
(2, 17, 7, 'Romeo y Julieta', '1597-03-01', 16500),
(3, 18, 8, 'Romeo y Julieta', '1597-03-01', 16500),
(4, 20, 10, 'Romeo y Julieta', '1597-03-01', 16500);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bookType`
--

CREATE TABLE `bookType` (
  `id_type` int(11) NOT NULL,
  `type` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `bookType`
--

INSERT INTO `bookType` (`id_type`, `type`) VALUES
(1, 'Novela'),
(7, 'Drama'),
(8, 'Drama'),
(9, 'Novela'),
(10, 'Drama'),
(11, 'Novela');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `author`
--
ALTER TABLE `author`
  ADD PRIMARY KEY (`id_author`);

--
-- Indices de la tabla `authorContact`
--
ALTER TABLE `authorContact`
  ADD PRIMARY KEY (`id_authorContact`);

--
-- Indices de la tabla `book`
--
ALTER TABLE `book`
  ADD PRIMARY KEY (`id_book`);

--
-- Indices de la tabla `bookType`
--
ALTER TABLE `bookType`
  ADD PRIMARY KEY (`id_type`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `author`
--
ALTER TABLE `author`
  MODIFY `id_author` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;
--
-- AUTO_INCREMENT de la tabla `authorContact`
--
ALTER TABLE `authorContact`
  MODIFY `id_authorContact` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `book`
--
ALTER TABLE `book`
  MODIFY `id_book` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `bookType`
--
ALTER TABLE `bookType`
  MODIFY `id_type` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
