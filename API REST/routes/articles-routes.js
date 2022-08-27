const express = require('express');
const { check } = require('express-validator');

const articlesController = require('../controllers/articles-controllers');

const router = express.Router();

router.get('/', articlesController.getArticles);

router.get('/:id', articlesController.getArticleById);

router.get('/categorie/:name', articlesController.getArticlesByNameCategorie);


module.exports = router;
