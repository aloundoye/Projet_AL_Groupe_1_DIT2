const mongoose = require('mongoose');

const Schema = mongoose.Schema;

const articleSchema = new Schema({
  name: { type: String, required: true },
  description: { type: String, required: true },
  content: { type: String, required: true },
  categorie: { type: String, required: true },
  
});

module.exports = mongoose.model('Article', articleSchema);
