const quotes = [
  {
    quote:
    "\n\"좋은 프로그래머 대부분은 돈이나 대중에게 받을 찬사를 기대하고 프로그래밍을 하지 않고 프로그래밍이 재미 있어서 한다.\"\n\"Most good programmers do programming not because they expect to get paid or get adulation by the public, but because it is fun to program.\"",
    author: "\n\n-리누스 토르발스(Linus Torvalds)\n\n",
  },
  {
    quote:
    "\n\"완벽함은 아무것도 더할 것이 없을 때가 아닌, 아무것도 제거할 것이 남지 않았을 때 달성된다.\"\n\"Perfection [in design] is achieved, not when there is nothing more to add, but when there is nothing left to take away.\"",
    author: "\n\n-앙투안 드 생텍쥐페리(Antoine de Saint-Exupéry)\n\n",
  },
  {
    quote:
    "\n\"알고리즘 공부하세요.\"\n\"Just go study algorithm.\"",
    author: "\n\n-오 교수님(Professor Oh)\n\n",
  },
  {
    quote:
    "\n\"한 가지 최고의 조언은 어떻게 더 잘 해낼 수 있는지 끊임없이 생각하고 스스로에게 계속 질문을 던지세요.\"\n\"One of the best tips is to constantly think about how you can do better and keep asking yourself questions.\"",
    author: "\n\n-일론 머스크(Elon Reeve Musk)\n\n",
  }
  
];

const quote = document.querySelector("#quote span:first-child");
const author = document.querySelector("#quote span:last-child");

const todaysQuote = quotes[Math.floor(Math.random() * quotes.length)];

quote.innerText = todaysQuote.quote;
author.innerText = todaysQuote.author;
