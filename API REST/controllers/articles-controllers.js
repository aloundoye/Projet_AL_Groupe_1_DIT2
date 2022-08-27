const { v4: uuid } = require('uuid');
const { validationResult } = require('express-validator');

const HttpError = require('../models/http-error');
const Article = require('../models/article');
const { default: mongoose } = require('mongoose');

const getArticles = async (req, res, next) => {
  let articles;

  try {
    articles = await Article.find();
  } catch (err) {
    const error = new HttpError('Aucun article trouver', 404);

    return next(error);
  }

  if (!articles || articles.length === 0) {
    const error = new HttpError('Aucun article trouver', 404);
    return next(error);
  }

  res.json({
    articles: articles.map((article) => article.toObject({ getters: true })),
  });
};

const getArticleById = async (req, res, next) => {
  const articleId = req.params.id;

  let article;
  try {
    article = await Article.findById(articleId);
  } catch (err) {
    const error = new HttpError('Article non trouver', 500);

    return next(error);
  }

  if (!article) {
    const error = new HttpError('Article non trouver', 404);
    return next(error);
  }

  res.json({ article: article.toObject({ getters: true }) });
};

const getArticlesByNameCategorie = async (req, res, next) => {
  const categorieName = req.params.name;

  let articles;
  try {
    articles = await Article.find({ categorie: categorieName });
  } catch (err) {
    const error = new HttpError('Articles non trouver pour cet categorie', 404);

    return next(error);
  }

  if (!articles || articles.length === 0) {
    return next(new HttpError('Articles non trouver pour cet categorie', 404));
  }

  res.json({
    articles: articles.map((article) => article.toObject({ getters: true })),
  });
};

exports.getArticleById = getArticleById;
exports.getArticlesByNameCategorie = getArticlesByNameCategorie;
exports.getArticles = getArticles;
