# Metadata 101 Schema Repository

https://metadata101.github.io/schemas/ is a schema repository for Metadata 101.

This repository is structured following into folders by `organization/standard/version`:

* [iso/19135-2-2012](iso/19135-2-2012)
* [can/171.100-2009](can/171.100-2009)
* [fgp/hnap/2.3.1](fgp/hnap/2.3.1)

Please check directory `README.md` files for modifications, notes, and namespace.

# Usage

The schemas in this repository may be referenced directly, althrough no availability guarantee provided for github pages.

It is a best practice to download schemas for local use (to avoid contacting the github pages each time the schema is used).  Developers may wish to use `git submodule` to include this repository directly in their project.  

# GitHub Pages

This repository is published to github pages using [Jekyll](https://jekyllrb.com). See [Jekyll installation instructions](https://jekyllrb.com/docs/installation/) to set up a development environment:

1. Use bundler:

   ```
   gem install bundler
   ```

2. Install ruby gems (such as `github-pages`):
   ```
   bundle
   ```
   
3. Build and run locally:
   
   ```
   bundle exec jekyll serve
   ```

4. Browser: http://localhost:4000/

# Just the docs

Repository web pages use the [Just The Docs](https://pmarsceill.github.io/just-the-docs/) theme (MIT License).